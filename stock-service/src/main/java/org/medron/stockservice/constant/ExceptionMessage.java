package org.medron.stockservice.constant;

public class ExceptionMessage {
    private ExceptionMessage(){

    }
    public static class Product{
        public final static String ENTITY_NOT_EXIST = "PRODUCT_ENTITY_NOT_EXIST";
        public static final String NAME_ALREADY_EXIST = "PRODUCT_NAME_ALREADY_EXIST";
    }
    public static class Category{
        public static final String ENTITY_NOT_EXIST = "CATEGORY_ENTITY_NOT_EXIST";

        public static final String NAME_ALREADY_EXIST = "CATEGORY_NAME_ALREADY_EXIST";
    }
}
