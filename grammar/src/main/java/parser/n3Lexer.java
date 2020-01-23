// Generated from n3.g4 by ANTLR 4.7.2

    package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class n3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, COMMENT=28, NumericLiteral=29, BooleanLiteral=30, 
		String=31, BlankNode=32, QuickVar=33, IRIREF=34, PNAME_NS=35, PNAME_LN=36, 
		BLANK_NODE_LABEL=37, LANGTAG=38, INTEGER=39, DECIMAL=40, DOUBLE=41, EXPONENT=42, 
		STRING_LITERAL_LONG_SINGLE_QUOTE=43, STRING_LITERAL_LONG_QUOTE=44, STRING_LITERAL_QUOTE=45, 
		STRING_LITERAL_SINGLE_QUOTE=46, UCHAR=47, ECHAR=48, WS=49, ANON=50, PN_CHARS_BASE=51, 
		PN_CHARS_U=52, PN_CHARS=53, BASE=54, PREFIX=55, PN_PREFIX=56, PN_LOCAL=57, 
		PLX=58, PERCENT=59, HEX=60, PN_LOCAL_ESC=61;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "COMMENT", "NumericLiteral", "BooleanLiteral", "String", 
			"BlankNode", "QuickVar", "IRIREF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", 
			"LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", "STRING_LITERAL_LONG_SINGLE_QUOTE", 
			"STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", "STRING_LITERAL_SINGLE_QUOTE", 
			"UCHAR", "ECHAR", "WS", "ANON", "PN_CHARS_BASE", "PN_CHARS_U", "PN_CHARS", 
			"BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", "PLX", "PERCENT", "HEX", "PN_LOCAL_ESC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'@prefix'", "'@base'", "';'", "','", "'a'", "'@a'", "'has'", 
			"'@has'", "'is'", "'of'", "'@is'", "'@of'", "'='", "'<='", "'=>'", "'^'", 
			"'!'", "'['", "']'", "'('", "')'", "'{'", "'}'", "'^^'", "'@forSome'", 
			"'@forAll'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "COMMENT", "NumericLiteral", "BooleanLiteral", 
			"String", "BlankNode", "QuickVar", "IRIREF", "PNAME_NS", "PNAME_LN", 
			"BLANK_NODE_LABEL", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "EXPONENT", 
			"STRING_LITERAL_LONG_SINGLE_QUOTE", "STRING_LITERAL_LONG_QUOTE", "STRING_LITERAL_QUOTE", 
			"STRING_LITERAL_SINGLE_QUOTE", "UCHAR", "ECHAR", "WS", "ANON", "PN_CHARS_BASE", 
			"PN_CHARS_U", "PN_CHARS", "BASE", "PREFIX", "PN_PREFIX", "PN_LOCAL", 
			"PLX", "PERCENT", "HEX", "PN_LOCAL_ESC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public n3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "n3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u0230\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\7\35\u00dc\n\35\f\35\16\35\u00df\13\35\3\35\3\35\3\36"+
		"\3\36\3\36\5\36\u00e6\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00fc\n\37"+
		"\3 \3 \3 \3 \5 \u0102\n \3!\3!\5!\u0106\n!\3\"\3\"\3\"\7\"\u010b\n\"\f"+
		"\"\16\"\u010e\13\"\3#\3#\3#\7#\u0113\n#\f#\16#\u0116\13#\3#\3#\3$\5$\u011b"+
		"\n$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\5&\u0127\n&\3&\3&\7&\u012b\n&\f&\16"+
		"&\u012e\13&\3&\5&\u0131\n&\3\'\3\'\6\'\u0135\n\'\r\'\16\'\u0136\3\'\3"+
		"\'\6\'\u013b\n\'\r\'\16\'\u013c\7\'\u013f\n\'\f\'\16\'\u0142\13\'\3(\5"+
		"(\u0145\n(\3(\6(\u0148\n(\r(\16(\u0149\3)\5)\u014d\n)\3)\7)\u0150\n)\f"+
		")\16)\u0153\13)\3)\3)\6)\u0157\n)\r)\16)\u0158\3*\5*\u015c\n*\3*\6*\u015f"+
		"\n*\r*\16*\u0160\3*\3*\7*\u0165\n*\f*\16*\u0168\13*\3*\3*\3*\6*\u016d"+
		"\n*\r*\16*\u016e\3*\3*\6*\u0173\n*\r*\16*\u0174\3*\5*\u0178\n*\3+\3+\5"+
		"+\u017c\n+\3+\6+\u017f\n+\r+\16+\u0180\3,\3,\3,\3,\3,\3,\3,\5,\u018a\n"+
		",\3,\3,\3,\5,\u018f\n,\7,\u0191\n,\f,\16,\u0194\13,\3,\3,\3,\3,\3-\3-"+
		"\3-\3-\3-\3-\3-\5-\u01a1\n-\3-\3-\3-\5-\u01a6\n-\7-\u01a8\n-\f-\16-\u01ab"+
		"\13-\3-\3-\3-\3-\3.\3.\3.\3.\7.\u01b5\n.\f.\16.\u01b8\13.\3.\3.\3/\3/"+
		"\3/\3/\7/\u01c0\n/\f/\16/\u01c3\13/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u01db\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\7\63\u01e6"+
		"\n\63\f\63\16\63\u01e9\13\63\3\63\3\63\3\64\5\64\u01ee\n\64\3\65\3\65"+
		"\5\65\u01f2\n\65\3\66\3\66\5\66\u01f6\n\66\3\67\3\67\3\67\3\67\3\67\3"+
		"8\38\38\38\38\38\38\39\39\39\79\u0207\n9\f9\169\u020a\139\39\59\u020d"+
		"\n9\3:\3:\3:\5:\u0212\n:\3:\3:\3:\7:\u0217\n:\f:\16:\u021a\13:\3:\3:\3"+
		":\5:\u021f\n:\5:\u0221\n:\3;\3;\5;\u0225\n;\3<\3<\3<\3<\3=\5=\u022c\n"+
		"=\3>\3>\3>\2\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\65i\66k\67m8o9q:s;u<w=y>{?\3\2\34\4\2\f\f\16\17\n\2\2!$$>>@@^^``bb}"+
		"\177\3\2\62;\4\2C\\c|\5\2\62;C\\c|\4\2--//\4\2GGgg\4\2))^^\4\2$$^^\6\2"+
		"\f\f\17\17$$^^\6\2\f\f\17\17))^^\n\2$$))^^ddhhppttvv\5\2\13\f\17\17\""+
		"\"\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001"+
		"\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff"+
		"\7\2//\62;\u00b9\u00b9\u0302\u0371\u2041\u2042\4\2DDdd\4\2CCcc\4\2UUu"+
		"u\4\2RRrr\4\2TTtt\4\2HHhh\4\2KKkk\4\2ZZzz\4\2\60\60<<\5\2\62;CHch\t\2"+
		"##%\61==??ABaa\u0080\u0080\2\u0272\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\177\3\2\2\2\7"+
		"\u0087\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17\u0093"+
		"\3\2\2\2\21\u0096\3\2\2\2\23\u009a\3\2\2\2\25\u009f\3\2\2\2\27\u00a2\3"+
		"\2\2\2\31\u00a5\3\2\2\2\33\u00a9\3\2\2\2\35\u00ad\3\2\2\2\37\u00af\3\2"+
		"\2\2!\u00b2\3\2\2\2#\u00b5\3\2\2\2%\u00b7\3\2\2\2\'\u00b9\3\2\2\2)\u00bb"+
		"\3\2\2\2+\u00bd\3\2\2\2-\u00bf\3\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2"+
		"\63\u00c5\3\2\2\2\65\u00c8\3\2\2\2\67\u00d1\3\2\2\29\u00d9\3\2\2\2;\u00e5"+
		"\3\2\2\2=\u00fb\3\2\2\2?\u0101\3\2\2\2A\u0105\3\2\2\2C\u0107\3\2\2\2E"+
		"\u010f\3\2\2\2G\u011a\3\2\2\2I\u011e\3\2\2\2K\u0121\3\2\2\2M\u0132\3\2"+
		"\2\2O\u0144\3\2\2\2Q\u014c\3\2\2\2S\u015b\3\2\2\2U\u0179\3\2\2\2W\u0182"+
		"\3\2\2\2Y\u0199\3\2\2\2[\u01b0\3\2\2\2]\u01bb\3\2\2\2_\u01da\3\2\2\2a"+
		"\u01dc\3\2\2\2c\u01df\3\2\2\2e\u01e3\3\2\2\2g\u01ed\3\2\2\2i\u01f1\3\2"+
		"\2\2k\u01f5\3\2\2\2m\u01f7\3\2\2\2o\u01fc\3\2\2\2q\u0203\3\2\2\2s\u0211"+
		"\3\2\2\2u\u0224\3\2\2\2w\u0226\3\2\2\2y\u022b\3\2\2\2{\u022d\3\2\2\2}"+
		"~\7\60\2\2~\4\3\2\2\2\177\u0080\7B\2\2\u0080\u0081\7r\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7h\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7z\2\2\u0086\6\3\2\2\2\u0087\u0088\7B\2\2\u0088\u0089\7d\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\b\3\2\2\2\u008d"+
		"\u008e\7=\2\2\u008e\n\3\2\2\2\u008f\u0090\7.\2\2\u0090\f\3\2\2\2\u0091"+
		"\u0092\7c\2\2\u0092\16\3\2\2\2\u0093\u0094\7B\2\2\u0094\u0095\7c\2\2\u0095"+
		"\20\3\2\2\2\u0096\u0097\7j\2\2\u0097\u0098\7c\2\2\u0098\u0099\7u\2\2\u0099"+
		"\22\3\2\2\2\u009a\u009b\7B\2\2\u009b\u009c\7j\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7u\2\2\u009e\24\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1"+
		"\26\3\2\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7h\2\2\u00a4\30\3\2\2\2\u00a5"+
		"\u00a6\7B\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7u\2\2\u00a8\32\3\2\2\2\u00a9"+
		"\u00aa\7B\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7h\2\2\u00ac\34\3\2\2\2\u00ad"+
		"\u00ae\7?\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7?\2\2\u00b1"+
		" \3\2\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7@\2\2\u00b4\"\3\2\2\2\u00b5"+
		"\u00b6\7`\2\2\u00b6$\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8&\3\2\2\2\u00b9\u00ba"+
		"\7]\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7_\2\2\u00bc*\3\2\2\2\u00bd\u00be\7"+
		"*\2\2\u00be,\3\2\2\2\u00bf\u00c0\7+\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7}"+
		"\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7\177\2\2\u00c4\62\3\2\2\2\u00c5\u00c6"+
		"\7`\2\2\u00c6\u00c7\7`\2\2\u00c7\64\3\2\2\2\u00c8\u00c9\7B\2\2\u00c9\u00ca"+
		"\7h\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7U\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7g\2\2\u00d0\66\3\2\2\2\u00d1"+
		"\u00d2\7B\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7t\2\2"+
		"\u00d5\u00d6\7C\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7n\2\2\u00d88\3\2\2"+
		"\2\u00d9\u00dd\7%\2\2\u00da\u00dc\n\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\b\35\2\2\u00e1:\3\2\2\2\u00e2\u00e6\5O(\2\u00e3"+
		"\u00e6\5Q)\2\u00e4\u00e6\5S*\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2"+
		"\u00e5\u00e4\3\2\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7t"+
		"\2\2\u00e9\u00ea\7w\2\2\u00ea\u00fc\7g\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7u\2\2\u00ef\u00fc\7g\2\2\u00f0"+
		"\u00f1\7B\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7w\2\2"+
		"\u00f4\u00fc\7g\2\2\u00f5\u00f6\7B\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8"+
		"\7c\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fc\7g\2\2\u00fb"+
		"\u00e7\3\2\2\2\u00fb\u00eb\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00f5\3\2"+
		"\2\2\u00fc>\3\2\2\2\u00fd\u0102\5[.\2\u00fe\u0102\5]/\2\u00ff\u0102\5"+
		"W,\2\u0100\u0102\5Y-\2\u0101\u00fd\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0100\3\2\2\2\u0102@\3\2\2\2\u0103\u0106\5K&\2\u0104\u0106"+
		"\5e\63\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106B\3\2\2\2\u0107"+
		"\u0108\7A\2\2\u0108\u010c\5i\65\2\u0109\u010b\5k\66\2\u010a\u0109\3\2"+
		"\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"D\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0114\7>\2\2\u0110\u0113\n\3\2\2\u0111"+
		"\u0113\5_\60\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\7@\2\2\u0118F\3\2\2\2\u0119\u011b\5q9\2\u011a"+
		"\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7<"+
		"\2\2\u011dH\3\2\2\2\u011e\u011f\5G$\2\u011f\u0120\5s:\2\u0120J\3\2\2\2"+
		"\u0121\u0122\7a\2\2\u0122\u0123\7<\2\2\u0123\u0126\3\2\2\2\u0124\u0127"+
		"\5i\65\2\u0125\u0127\t\4\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127"+
		"\u0130\3\2\2\2\u0128\u012b\5k\66\2\u0129\u012b\7\60\2\2\u012a\u0128\3"+
		"\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\5k"+
		"\66\2\u0130\u012c\3\2\2\2\u0130\u0131\3\2\2\2\u0131L\3\2\2\2\u0132\u0134"+
		"\7B\2\2\u0133\u0135\t\5\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0140\3\2\2\2\u0138\u013a\7/"+
		"\2\2\u0139\u013b\t\6\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0138\3\2"+
		"\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"N\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145\t\7\2\2\u0144\u0143\3\2\2\2"+
		"\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\t\4\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"P\3\2\2\2\u014b\u014d\t\7\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2"+
		"\u014d\u0151\3\2\2\2\u014e\u0150\t\4\2\2\u014f\u014e\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0156\7\60\2\2\u0155\u0157\t\4\2\2\u0156\u0155\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"R\3\2\2\2\u015a\u015c\t\7\2\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2"+
		"\u015c\u0177\3\2\2\2\u015d\u015f\t\4\2\2\u015e\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0166\7\60\2\2\u0163\u0165\t\4\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3"+
		"\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0169\u0178\5U+\2\u016a\u016c\7\60\2\2\u016b\u016d\t\4"+
		"\2\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0178\5U+\2\u0171\u0173\t\4\2"+
		"\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\5U+\2\u0177\u015e\3\2\2\2\u0177"+
		"\u016a\3\2\2\2\u0177\u0172\3\2\2\2\u0178T\3\2\2\2\u0179\u017b\t\b\2\2"+
		"\u017a\u017c\t\7\2\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e"+
		"\3\2\2\2\u017d\u017f\t\4\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181V\3\2\2\2\u0182\u0183\7)\2\2\u0183"+
		"\u0184\7)\2\2\u0184\u0185\7)\2\2\u0185\u0192\3\2\2\2\u0186\u018a\7)\2"+
		"\2\u0187\u0188\7)\2\2\u0188\u018a\7)\2\2\u0189\u0186\3\2\2\2\u0189\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018f\n\t\2\2\u018c"+
		"\u018f\5a\61\2\u018d\u018f\5_\60\2\u018e\u018b\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018e\u018d\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u0189\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7)\2\2\u0196\u0197\7)\2\2\u0197\u0198"+
		"\7)\2\2\u0198X\3\2\2\2\u0199\u019a\7$\2\2\u019a\u019b\7$\2\2\u019b\u019c"+
		"\7$\2\2\u019c\u01a9\3\2\2\2\u019d\u01a1\7$\2\2\u019e\u019f\7$\2\2\u019f"+
		"\u01a1\7$\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a5\3\2\2\2\u01a2\u01a6\n\n\2\2\u01a3\u01a6\5a\61\2\u01a4"+
		"\u01a6\5_\60\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2"+
		"\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a0\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ac\u01ad\7$\2\2\u01ad\u01ae\7$\2\2\u01ae\u01af\7$\2\2\u01afZ\3"+
		"\2\2\2\u01b0\u01b6\7$\2\2\u01b1\u01b5\n\13\2\2\u01b2\u01b5\5a\61\2\u01b3"+
		"\u01b5\5_\60\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2"+
		"\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba\7$\2\2\u01ba\\\3\2\2\2"+
		"\u01bb\u01c1\7)\2\2\u01bc\u01c0\n\f\2\2\u01bd\u01c0\5a\61\2\u01be\u01c0"+
		"\5_\60\2\u01bf\u01bc\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7)\2\2\u01c5^\3\2\2\2\u01c6\u01c7"+
		"\7^\2\2\u01c7\u01c8\7w\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\5y=\2\u01ca"+
		"\u01cb\5y=\2\u01cb\u01cc\5y=\2\u01cc\u01cd\5y=\2\u01cd\u01db\3\2\2\2\u01ce"+
		"\u01cf\7^\2\2\u01cf\u01d0\7W\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\5y=\2"+
		"\u01d2\u01d3\5y=\2\u01d3\u01d4\5y=\2\u01d4\u01d5\5y=\2\u01d5\u01d6\5y"+
		"=\2\u01d6\u01d7\5y=\2\u01d7\u01d8\5y=\2\u01d8\u01d9\5y=\2\u01d9\u01db"+
		"\3\2\2\2\u01da\u01c6\3\2\2\2\u01da\u01ce\3\2\2\2\u01db`\3\2\2\2\u01dc"+
		"\u01dd\7^\2\2\u01dd\u01de\t\r\2\2\u01deb\3\2\2\2\u01df\u01e0\t\16\2\2"+
		"\u01e0\u01e1\3\2\2\2\u01e1\u01e2\b\62\2\2\u01e2d\3\2\2\2\u01e3\u01e7\7"+
		"]\2\2\u01e4\u01e6\5c\62\2\u01e5\u01e4\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01ea\u01eb\7_\2\2\u01ebf\3\2\2\2\u01ec\u01ee\t\17\2\2\u01ed\u01ec"+
		"\3\2\2\2\u01eeh\3\2\2\2\u01ef\u01f2\5g\64\2\u01f0\u01f2\7a\2\2\u01f1\u01ef"+
		"\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2j\3\2\2\2\u01f3\u01f6\5i\65\2\u01f4"+
		"\u01f6\t\20\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6l\3\2\2\2"+
		"\u01f7\u01f8\t\21\2\2\u01f8\u01f9\t\22\2\2\u01f9\u01fa\t\23\2\2\u01fa"+
		"\u01fb\t\b\2\2\u01fbn\3\2\2\2\u01fc\u01fd\t\24\2\2\u01fd\u01fe\t\25\2"+
		"\2\u01fe\u01ff\t\b\2\2\u01ff\u0200\t\26\2\2\u0200\u0201\t\27\2\2\u0201"+
		"\u0202\t\30\2\2\u0202p\3\2\2\2\u0203\u020c\5g\64\2\u0204\u0207\5k\66\2"+
		"\u0205\u0207\7\60\2\2\u0206\u0204\3\2\2\2\u0206\u0205\3\2\2\2\u0207\u020a"+
		"\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020b\u020d\5k\66\2\u020c\u0208\3\2\2\2\u020c\u020d\3\2"+
		"\2\2\u020dr\3\2\2\2\u020e\u0212\5i\65\2\u020f\u0212\4\62<\2\u0210\u0212"+
		"\5u;\2\u0211\u020e\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212"+
		"\u0220\3\2\2\2\u0213\u0217\5k\66\2\u0214\u0217\t\31\2\2\u0215\u0217\5"+
		"u;\2\u0216\u0213\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0215\3\2\2\2\u0217"+
		"\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021e\3\2"+
		"\2\2\u021a\u0218\3\2\2\2\u021b\u021f\5k\66\2\u021c\u021f\7<\2\2\u021d"+
		"\u021f\5u;\2\u021e\u021b\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021d\3\2\2"+
		"\2\u021f\u0221\3\2\2\2\u0220\u0218\3\2\2\2\u0220\u0221\3\2\2\2\u0221t"+
		"\3\2\2\2\u0222\u0225\5w<\2\u0223\u0225\5{>\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0223\3\2\2\2\u0225v\3\2\2\2\u0226\u0227\7\'\2\2\u0227\u0228\5y=\2\u0228"+
		"\u0229\5y=\2\u0229x\3\2\2\2\u022a\u022c\t\32\2\2\u022b\u022a\3\2\2\2\u022c"+
		"z\3\2\2\2\u022d\u022e\7^\2\2\u022e\u022f\t\33\2\2\u022f|\3\2\2\29\2\u00dd"+
		"\u00e5\u00fb\u0101\u0105\u010c\u0112\u0114\u011a\u0126\u012a\u012c\u0130"+
		"\u0136\u013c\u0140\u0144\u0149\u014c\u0151\u0158\u015b\u0160\u0166\u016e"+
		"\u0174\u0177\u017b\u0180\u0189\u018e\u0192\u01a0\u01a5\u01a9\u01b4\u01b6"+
		"\u01bf\u01c1\u01da\u01e7\u01ed\u01f1\u01f5\u0206\u0208\u020c\u0211\u0216"+
		"\u0218\u021e\u0220\u0224\u022b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}