grammar Hello;

program: package_decl? import_decl* ( interface_decl | class_decl )+;
stmt : 	if_stmt | 
		while_stmt | 
		expression | 
		return_stmt | 
		continue_stmt |
		break_stmt |
		assignment_stmt |
		method_call		;

compound :  '{' stmt* '}'  ;
while_stmt : if_condition '계속' compound '을 반복' ;
if_stmt : if_condition compound
		| if_condition compound else_condition compound
		| if_condition compound (else_if_condition compound)+ else_condition compound;
return_stmt : expression RETURN | 
			 RETURN ;

package_decl : '꾸러미' IDENT;
import_decl : '가져오기' IDENT ('.' (IDENT |'*'))*;

interface_decl : 	'틀' IDENT extend? interface_compound;
interface_compound: '{' class_method* '}';

class_decl : 		'#' '['IDENT(']은'|']는'|']') extend? implement* class_compound;
class_compound : '{' (class_static_field | class_field)* class_method*  '}';
class_method : IDENT '(' params? ')' compound; 

class_static_field : '공용' class_field;
class_field : '|' (class_field_decl | class_field_array_decl) (',' (class_field_decl | class_field_array_decl))* '|';
class_field_decl: assignment_stmt;
class_field_array_decl: IDENT '<-' '[' (expression_array) ']' ;

extend:  '['IDENT(']을'|']를') '확장';
implement: ', [' IDENT (',' IDENT)* (']을' | ']를') '구현';


params : param (',' param)*;
param : IDENT;

continue_stmt : CONTINUE ;
break_stmt : BREAK ;

expression : expression op expression |
			 monoOp expression | 
			(IDENT|class_ident|NUM|array_ident) ;

assignment_stmt : (IDENT|class_ident|array_ident) '<-' expression |
				  (IDENT|class_ident|array_ident);

if_condition : '(' expression ')' ('이라면' | '라면') 	;
else_condition : '아니면';
else_if_condition : '혹은' if_condition;
expression_array: (NUM | IDENT)
				| left=expression_array op right=expression_array
				| array_ident
				| class_ident 
				| method_call;
				
array_ident : IDENT '[' expression_array ']' ;
class_ident : (IDENT | array_ident) ('.' (array_ident | IDENT))+;
method_call : (IDENT | class_ident) '(' args? ')' ;
args : expression_array(',' expression_array)*;
NUM :  '0' | [1-9] [0-9]*;
IDENT : [a-zA-Z가-힣_]([a-zA-Z가-힣_] | [0-9])*;
RETURN: '내보내기';
CONTINUE: '다시 위로';
BREAK: '나가기';
op : '+' | '-' | '*' | '/' | '%' | '=' | '<' | '>' | '>=' | '<=' | '그리고' | '또는' | '!=' ;
monoOp : '!';

WS  :   (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);
 