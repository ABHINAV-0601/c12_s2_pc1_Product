package com.question;

import com.question.config.AppConfig;
import com.question.domain.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Product nescafe = context.getBean("nescafe",Product.class);
        Product bru = context.getBean("bru",Product.class);

        System.out.println(nescafe);
        System.out.println();
        System.out.println(bru);

    }
}
