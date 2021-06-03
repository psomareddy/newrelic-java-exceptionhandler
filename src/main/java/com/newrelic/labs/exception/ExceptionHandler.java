package com.newrelic.labs.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

@Weave(originalName = "javax.servlet.http.HttpServlet", type = MatchType.BaseClass)
//@Weave(originalName = "com.guidewire.pl.system.integration.plugins.PluginInvocationHandler", type = MatchType.BaseClass)
public class ExceptionHandler {
	
	@Trace(dispatcher = true)
	protected void service(HttpServletRequest request, HttpServletResponse response) {
		try {
			Weaver.callOriginal();
		} catch (Throwable t) {
			NewRelic.noticeError(t);
			throw t;
		}
	}

}
