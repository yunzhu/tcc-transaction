package org.mengyun.tcctransaction.sample.http.order.web.comm;

import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.web.context.ServletContextAware;

/**
 * 初始化应用上下文
 * 
 * @author ChenFeng
 * @date 2014/04/18
 */
public class MyApplicationContextInit implements ServletContextAware {

	private ServletContext servletContext;

	private String contextPath;

	public void init() throws IOException {
		// Web应用的上下文路径放到应用上下文中
		this.contextPath = this.servletContext.getContextPath();
		this.servletContext.setAttribute("contextPath", this.contextPath);
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public String getContextPath() {
		return contextPath;
	}

}