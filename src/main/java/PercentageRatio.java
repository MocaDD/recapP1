import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;

class PercentageRatio {

    <E> double calculatePercentageRatio(E element) {

        int simpleProperties = 0;
        int complexProperties = 0;

        for (Field field : ReflectionUtils.getAllFields(element.getClass())) {
            if (field.getType().isPrimitive()) {
                simpleProperties++;
            } else if (field.getType().getSimpleName().equals("String")) {
                simpleProperties++;
            } else {
                complexProperties++;
            }
        }
        return simpleProperties * 100 / (simpleProperties + complexProperties);
    }
}