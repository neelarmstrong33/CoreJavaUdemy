package AnnontationExample;

import java.lang.annotation.Repeatable;

@Repeatable(Categories.class)
public @interface Category {
    String name();
}
