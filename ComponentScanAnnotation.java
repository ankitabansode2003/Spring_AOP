package com.project.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan(basePackages = "com.project")
@EnableAspectJAutoProxy
public class ComponentScanAnnotation {

}
