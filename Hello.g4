grammar Hello;

program
: 
   package_decl? import_decl* ( interface_decl | class_decl )+
;

package_decl
: 
   '꾸러미' ident (dot ident)*
;

dot
:
   '.'
;

import_decl 
: 
   '가져오기' ident (dot (ident |'*'))*
;

interface_decl 
:
   '틀' '['ident(']은'|']는'|']') extend? interface_compound
;

interface_compound
: 
   '{' interface_method* '}'
;

interface_method
: 
  ident '(' params? ')'
;

class_decl 
: 
   POUND '['ident(']은'|']는'|']') extend? implement? class_compound
;


extend
:  
   '['ident(']을'|']를') '확장'
;

implement
: 
   '[' ident (comma ident)* (']을' | ']를') '구현'
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
   '|' class_field_decl (comma class_field_decl)* '|'
;


comma
:
   ','
;

class_field_decl
: 
   assignment_stmt
;

class_method 
: 
   ident '(' params? ')' compound
;

params 
: 
   param (comma param)*
;

param 
: 
   ident
;

compound 
:  
   '{' stmt* '}'  
;

stmt 
:    if_stmt 
   | method_call
   | while_stmt 
   | return_stmt
   | continue_stmt
   | break_stmt 
   | assignment_stmt 
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
return_symbol
:
   RETURN
;

return_stmt 
: 
   expression return_symbol
   | return_symbol
; 
expression 
:   
   
   expression '(' args? ')' 
   | '(' expression ')'
   | classSymbol
   | boolean_literal
   | expression op expression 
   | prefixUnaryOP expression
   | expression postfixUnaryOP
   | expression '[' expression ']'
   | '[' expression ']'
   | expression dot expression
   | STR
   | (ident | num)
;

num
:
   NUM
;

ident
:
   IDENT
;

classSymbol
:
   POUND '[' IDENT ']' ('(' args? ')')?
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
             
method_call 
: 
   expression '(' args? ')' 
;

args 
   : expression(comma expression)*
;

continue_stmt 
: 
   CONTINUE 
;

break_stmt 
: 
   BREAK 
;

boolean_literal 
: 
   '참' | '거짓'
;

NUM 
:  
   '0' | [1-9] [0-9]*
;

IDENT 
: 
   [a-zA-Z가-힣_]([a-zA-Z가-힣_] | [0-9])*
;

POUND
:
   '#'
;


RETURN
: 
   '!내보내기'
;

CONTINUE
: 
   '!다시 위로'
;

BREAK
: 
   '!나가기'
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
STR
:
   '"' ( ~('"') )* '"'
;
WS  :   (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);