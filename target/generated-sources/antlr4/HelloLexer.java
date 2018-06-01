// Generated from Hello.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, NUM=16, IDENT=17, 
		Condition_t_node=18, While_t_node_1=19, While_t_node_2=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "NUM", "IDENT", "Condition_t_node", 
		"While_t_node_1", "While_t_node_2", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "'|'", "','", "'<-'", "'['", "']'", 
		"'.'", "'+'", "'-'", "'*'", "'/'", "'%'", null, null, null, "'\uACC4\uC18D'", 
		"'\uC744 \uBC18\uBCF5'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NUM", "IDENT", "Condition_t_node", "While_t_node_1", 
		"While_t_node_2", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21P\n\21\f\21\16\21"+
		"S\13\21\5\21U\n\21\3\22\3\22\7\22Y\n\22\f\22\16\22\\\13\22\3\23\3\23\3"+
		"\23\3\23\3\23\5\23c\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\6\26n\n\26\r\26\16\26o\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"\3\2\7\3\2\63;\3\2\62;\6\2C\\aac|\uac02\ud7a5\7\2\62;C\\aac|\uac02\ud7a5"+
		"\5\2\13\f\17\17\"\"\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67"+
		"\3\2\2\2\179\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27B\3\2\2\2\31"+
		"D\3\2\2\2\33F\3\2\2\2\35H\3\2\2\2\37J\3\2\2\2!T\3\2\2\2#V\3\2\2\2%b\3"+
		"\2\2\2\'d\3\2\2\2)g\3\2\2\2+m\3\2\2\2-.\7}\2\2.\4\3\2\2\2/\60\7\177\2"+
		"\2\60\6\3\2\2\2\61\62\7*\2\2\62\b\3\2\2\2\63\64\7+\2\2\64\n\3\2\2\2\65"+
		"\66\7~\2\2\66\f\3\2\2\2\678\7.\2\28\16\3\2\2\29:\7>\2\2:;\7/\2\2;\20\3"+
		"\2\2\2<=\7]\2\2=\22\3\2\2\2>?\7_\2\2?\24\3\2\2\2@A\7\60\2\2A\26\3\2\2"+
		"\2BC\7-\2\2C\30\3\2\2\2DE\7/\2\2E\32\3\2\2\2FG\7,\2\2G\34\3\2\2\2HI\7"+
		"\61\2\2I\36\3\2\2\2JK\7\'\2\2K \3\2\2\2LU\7\62\2\2MQ\t\2\2\2NP\t\3\2\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SQ\3\2\2\2TL\3\2\2\2"+
		"TM\3\2\2\2U\"\3\2\2\2VZ\t\4\2\2WY\t\5\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2"+
		"\2Z[\3\2\2\2[$\3\2\2\2\\Z\3\2\2\2]^\7\uc776\2\2^_\7\ub77e\2\2_c\7\uba76"+
		"\2\2`a\7\ub77e\2\2ac\7\uba76\2\2b]\3\2\2\2b`\3\2\2\2c&\3\2\2\2de\7\uacc6"+
		"\2\2ef\7\uc18f\2\2f(\3\2\2\2gh\7\uc746\2\2hi\7\"\2\2ij\7\ubc1a\2\2jk\7"+
		"\ubcf7\2\2k*\3\2\2\2ln\t\6\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2qr\b\26\2\2r,\3\2\2\2\t\2QTXZbo\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}