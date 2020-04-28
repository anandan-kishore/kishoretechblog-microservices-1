package com.kk.gateway;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;


@Component
public class PreFilter extends ZuulFilter {
	
	
	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		
		System.out.println("requested URL is :"+request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		//"post", "error"
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	
}
