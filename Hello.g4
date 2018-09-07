grammar Hello;

program
: 
	package_decl? import_decl* ( interface_decl | class_decl )+
;

package_decl
: 
	'꾸러미' IDENT ('.' IDENT)*
;

import_decl 
: 
	'가져오기' IDENT ('.' (IDENT |'*'))*
;

interface_decl 
:
	'틀' '['IDENT(']은'|']는'|']') extend? interface_compound
;

interface_compound
: 
	'{' interface_method* '}'
;

interface_method
: 
  IDENT '(' params? ')'
;

class_decl 
: 
	'#' '['IDENT(']은'|']는'|']') extend? implement? class_compound
;

extend
:  
	'['IDENT(']을'|']를') '확장'
;

implement
: 
	'[' IDENT (',' IDENT)* (']을' | ']를') '구현'
;

class_compound 
: 
	'{' (class_static_field | class_field)* class_method*  '}'
;

class_static_field 
: 
	'공용' class_field
;

class_field 
: 
	'|' class_field_decl (',' class_field_decl)* '|'
;

class_field_decl
: 
	assignment_stmt
;

class_method 
: 
	IDENT '(' params? ')' compound
;

params 
: 
	param (',' param)*
;

compound 
:  
	'{' stmt* '}'  
;

stmt 
: 	if_stmt 
	| while_stmt 
	| assignment_stmt 
	| return_stmt 
	| method_call 
	| continue_stmt 
	| break_stmt 
;

if_stmt 
: 	
	if_condition compound
	| if_condition compound else_condition compound
	| if_condition compound (else_if_condition compound)+ else_condition compound
;

if_condition 
: 
	'(' expression ')' ('이라면' | '라면') 	
;

else_condition 
: 
	'아니면'
;

else_if_condition 
: 
	'혹은' if_condition
;
		
while_stmt 
: 
	if_condition '계속' compound '을 반복' 
;

expression 
: 
	(NUM | IDENT)
	| boolean_literal
	| super_prefix
  	| this_prefix
	| expression op expression 
	| prefixUnaryOP expression
  	| expression postfixUnaryOP
	| expression '[' expression ']'
	| '[' expression ']'
	| expression '.' expression
	| expression '(' args? ')' 
;
	
super_prefix
:
  PARENT
;

this_prefix
:
  THIS
;
		
assignment_stmt 
: 
	expression assign_symbol expression 
	| expression
;

assign_symbol
:
	'<-'
;
				  
return_stmt 
: 
	expression RETURN 
	| RETURN 
; 

method_call 
: 
	expression '(' args? ')' 
;

args 
	: expression(',' expression)*
;

continue_stmt 
: 
	CONTINUE 
;

break_stmt 
: 
	BREAK 
;

param 
: 
	IDENT
;

boolean_literal 
: 
	'참' | '거짓'
;

idents 
: 
	IDENT
;

NUM 
:  
	'0' | [1-9] [0-9]*
;

IDENT 
: 
	[a-zA-Z가-힣_]([a-zA-Z가-힣_] | [0-9])*
;

PARENT
:
  '부모'
;

THIS 
: 
  '자신'
;

RETURN
: 
	'내보내기'
;

CONTINUE
: 
	'다시 위로'
;

BREAK
: 
	'나가기'
;

op : '+' | '-' | '*' | '/' | '%' | '=' | '<' | '>' | '>=' | '<=' | '그리고' | '또는' | '!=' ;

prefixUnaryOP 
: 
  '+' 
  | '-' 
  | '++' 
  | '--' 
  | '!'
;

postfixUnaryOP 
: 
  '++' 
  | '--'
;

WS  :   (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);
 