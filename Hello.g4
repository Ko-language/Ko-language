grammar Hello;

program: stmt+ ;
stmt : if_stmt | while_stmt | expression | class_field  		;
compound :  '{' stmt* '}'    						;
while_stmt : condition While_t_node_1 compound While_t_node_2 		;
if_stmt : condition compound						;
expression : left=NUM op right=NUM 					;
condition : '(' expression ')' Condition_t_node 	;

class_field : '|' (class_field_decl | class_field_array_decl) (',' (class_field_decl | class_field_array_decl))* '|';
class_field_decl: IDENT '<-' IDENT;
class_field_array_decl: IDENT '<-' '[' (expression_array) ']' ;
expression_array: (NUM | IDENT)
				| left=expression_array op right=expression_array
				| array_ident
				| class_ident 
				| method_call ;
array_ident : IDENT '[' expression_array ']' ;
class_ident : (IDENT | array_ident) ('.' (array_ident | IDENT))+;
method_call : (IDENT | class_ident) '(' args? ')' ;
args : expression_array(',' expression_array)*;


NUM :  '0' | [1-9] [0-9]*;
IDENT : [a-zA-Z가-힣_]([a-zA-Z가-힣_] | [0-9])*;

op : '+' | '-' | '*' | '/' | '%';
Condition_t_node : '이라면' | '라면' ; 
While_t_node_1 : '계속';
While_t_node_2 : '을 반복';
WS  :   (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);
 