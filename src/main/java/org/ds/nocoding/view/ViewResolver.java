package org.ds.nocoding.view;


import org.ds.nocoding.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ViewResolver {

    private static final Logger logger = LoggerFactory.getLogger(ViewResolver.class);

    public static void main(String[] args) {
        ViewResolver viewResolver = new ViewResolver();
//        Model resolve = viewResolver.resolve(PermissionFilter.class);


    }

    public Model resolve(Class<? extends Component> clazz) {
        Constructor<?>[] constructors = clazz.getConstructors();

//        Optional<Constructor<?>> constructorOptional = Arrays.stream(constructors).max(new Comparator<Constructor<?>>() {
//            @Override
//            public int compare(Constructor<?> o1, Constructor<?> o2) {
//                return Integer.compare(o1.getParameterCount(), o2.getParameterCount());
//            }
//        });
//        Constructor<?> constructor = constructorOptional.get();
//        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Constructor<?> constructor = constructors[0];
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        String[] parameters = Arrays.stream(parameterTypes).map(Class::getCanonicalName).toArray(String[]::new);

        logger.error("数组：" + Arrays.toString(parameters));

        return null;

    }
}
