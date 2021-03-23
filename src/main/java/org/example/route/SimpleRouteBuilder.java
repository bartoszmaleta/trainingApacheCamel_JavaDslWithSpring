package org.example.route;

import org.apache.camel.builder.RouteBuilder;
import org.example.processor.MyProcessor;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/home/acer/PROGRAMMING/Jobs/PKO_BP_JJD/ApacheCamel/simple_Java_DSL_copying_files app/inputFolder?noop=true").process(new MyProcessor()).to("file:/home/acer/PROGRAMMING/Jobs/PKO_BP_JJD/ApacheCamel/simple_Java_DSL_copying_files_app/outputFolder");
    }
}
