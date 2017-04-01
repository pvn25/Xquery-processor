grammar XQuery;



query: (optXq | xq);

optXq: 'for' optVarIn ('where' optCond | ) 'return' optReturn;
      
optCond:      Var ('eq'|'=') Var                                  #optVarsEq
            | StringConstant ('eq'|'=') StringConstant            #optStrsEq
            | Var ('eq'|'=') StringConstant                       #optVarStrEq
            | optCond 'and' optCond                               #optCondAnd
            ;

path:         doc (('/' | '//') NAME)* (('/' | '//') 'text()')?     #optApath
            | Var (('/' | '//') NAME)* (('/' | '//') 'text()')?     #optVarPath
            ;

optVarIn: Var 'in' path (',' Var 'in' path)*;

optReturn:          Var 
                  | optReturn ',' optReturn
                  | '<' NAME '>' '{' optReturn '}' '</' NAME '>'
                  | xq
                  ;


xq:      ap														#absolutePath
       | '(' xq ')'												#xqueryParen
       | xq '/' rp												#xqueryRelativePath
       | xq ',' xq												#xqueryConcat
       | xq '//' rp												#xqueryDescendent
       | '<' NAME '>' '{' xq '}' '</' NAME '>'					#xqueryTag
       | forClause (letClause| ) (whereClause| ) returnClause	#xqueryForLoop
       | letClause xq											#xqueryLetClause
       | StringConstant											#strConst
       | 'join' '(' xq ',' xq ',' vars1=varList ',' vars2=varList ')' #xqueryJoin
       | Var													#varXQ
       ;

varList: '[' (Var)? (',' Var)* ']';

forClause:  'for' varIn;

varIn:        Var 'in' xq (',' Var 'in' xq)*;

letClause:  'let' varEq;

varEq:        Var ':=' xq				#singleVarEq
            | varEq ',' varEq			#multiVarEq
            ;

whereClause: 'where' cond;

returnClause: 'return' xq;

cond:         xq '=' xq							#xqueryEq
            | xq 'eq' xq						#xqueryEq
            | xq '==' xq						#xqueryIs
            | xq 'is' xq						#xqueryIs
            | 'empty' '(' xq ')'				#xqueryEmpty
            | 'some' varIn 'satisfies' cond		#xquerySatisfy
            | '(' cond ')'						#xqueryCondParen
            | cond 'and' cond					#xqueryAnd
            | cond 'or' cond					#xqueryOr
            | 'not' cond						#xqueryNot
            ;

ap:     doc '/' rp            #absoluteChild
      | doc '//' rp           #absoluteDescendent
      ;

rp:     NAME            #tagName
      | '*'             #selectAny
      | '.'             #currentDir
      | '..'            #parentDir
      | 'text()'        #getText
      | '@' NAME        #attrName
      | '(' rp ')'      #relativeParen
      | rp '/' rp       #relativeChild
      | rp '//' rp      #relativeDescendent
      | rp '[' f ']'    #relativeWithFilter
      | rp ',' rp       #relativePathConcat
      ;

f:      rp              #rpFilter
      | rp '=' rp       #equalFilter
      | rp 'eq' rp      #equalFilter
      | rp '==' rp      #isFilter
      | rp 'is' rp      #isFilter
      | '(' f ')'       #filterParen
      | f 'and' f       #andFilter
      | f 'or' f        #orFilter
      | 'not' f         #notFilter
      ;
      
doc:    'doc' '("' NAME '")';

NAME:   [a-zA-Z_][a-zA-Z_0-9.-]*;

Var:    '$' [a-zA-Z_][a-zA-Z_0-9]*;

StringConstant: '"' [_A-Za-z0-9.!, \']* '"';

WS:     [ \t\n\r]+ -> skip;


