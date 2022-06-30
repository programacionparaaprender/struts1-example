package app.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import app.form.HelloWorldForm;

public class HelloWorldAction extends Action {

	public ActionForward execute(ActionMapping mapping,
		                         ActionForm form,
			                     HttpServletRequest request,
			                     HttpServletResponse response) throws Exception {
		String lang = (String)request.getParameter("lang");
		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		if ("es".equalsIgnoreCase(lang)) {
			request.getSession().setAttribute(Globals.LOCALE_KEY, new Locale("es"));
			helloWorldForm.setMessage("Hola Mundo! Struts @" + new java.util.Date());
		}
		else if ("th".equalsIgnoreCase(lang)) {
			request.getSession().setAttribute(Globals.LOCALE_KEY, new Locale("th"));
			helloWorldForm.setMessage("Hello World! Struts @" + new java.util.Date());
		}
		else {
			request.getSession().setAttribute(Globals.LOCALE_KEY, Locale.ENGLISH);
			helloWorldForm.setMessage("Hello World! Struts @" + new java.util.Date());
		}

		return mapping.findForward("view");
	}

}
