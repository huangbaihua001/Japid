package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import japidviews._layouts.*;
import japidviews._tags.*;
import static cn.bran.play.JapidPlayAdapter.*;
// NOTE: This file was generated from: japidviews/_tags/picka.html
// Change to this file will be lost next time the template file is compiled.
@cn.bran.play.NoEnhance
public class picka extends cn.bran.japid.template.JapidTemplateBase{
	public static final String sourceTemplate = "japidviews/_tags/picka.html";
static private final String static_0 = ""
;
	public picka() {
		super(null);
	}
	public picka(StringBuilder out) {
		super(out);
	}
	String a;
	String b;
	DoBody body;
	public static interface DoBody<A> {
		 void render(A a);
	}
	public cn.bran.japid.template.RenderResult render(String a, String b, DoBody body) {
		this.body = body;
		this.a = a;
		this.b = b;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResult(this.headers, getOut(), t);
	}
	@Override protected void doLayout() {
p(static_0);// line 1

if (body != null)
	body.render(a);


	}
}