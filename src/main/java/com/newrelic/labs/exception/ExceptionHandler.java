package com.newrelic.labs.exception;

import com.newrelic.api.agent.NewRelic;
import com.newrelic.api.agent.Trace;
import com.newrelic.api.agent.weaver.MatchType;
import com.newrelic.api.agent.weaver.Weave;
import com.newrelic.api.agent.weaver.Weaver;

@Weave(originalName = "com.guidewire.pl.system.integration.plugins.PluginInvocationHandler", type = MatchType.BaseClass)
public class ExceptionHandler {
	
	@Trace(dispatcher = true)
	public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) {
		try {
			return Weaver.callOriginal();
		} catch (Throwable t) {
			NewRelic.noticeError(t);
			throw t;
		}
	}

}
