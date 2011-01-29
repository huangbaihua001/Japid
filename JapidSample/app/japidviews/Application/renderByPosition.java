package japidviews.Application;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import models.japidsample.*;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import static cn.bran.play.WebUtils.*;
import japidviews._layouts.*;
import static  japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import play.data.validation.Error;
import japidviews._tags.*;
import controllers.*;
import play.mvc.Http.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/Application/renderByPosition.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class renderByPosition extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/Application/renderByPosition.html";
{
	headers.put("Content-Type", "text/html; charset=utf-8");
}
	public renderByPosition() {
		super(null);
	}
	public renderByPosition(StringBuilder out) {
		super(out);
	}
	private String ss;
	private int ii;
	private Author au1;
	private Author au2;
	private Author2 au22;
	public cn.bran.japid.template.RenderResult render(String ss, int ii, Author au1, Author au2, Author2 au22) {
		this.ss = ss;
		this.ii = ii;
		this.au1 = au1;
		this.au2 = au2;
		this.au22 = au22;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {

// - add implicit variables 

		final Request request = Request.current(); assert request != null;

		final Response response = Response.current(); assert response != null;

		final Flash flash = Flash.current();assert flash != null;

		final Session session = Session.current();assert session != null;

		final RenderArgs renderArgs = RenderArgs.current(); assert renderArgs != null;

		final Params params = Params.current();assert params != null;

		final Validation validation = Validation.current();assert validation!= null;

		final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);assert errors != null;

		final play.Play _play = new play.Play(); assert _play != null;

// - end of implicit variables 


//------
;// line 1
p("\n" + 
"got: ");// line 2
p(ss);// line 4
p("\n" + 
"got: ");// line 4
p(ii);// line 5
p("\n" + 
"got: ");// line 5
p(au1.name);// line 6
p(", ");// line 6
p(au2.name);// line 6
p(", ");// line 6
p(au22.who);// line 6
p("\n" + 
"\n");// line 6

	}

}