import org.apache.commons.lang3.ClassUtils;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;

class PercentageRatio {

    <E> double calculatePercentageRatio(E element) {

        int simpleProperties = 0;
        int complexProperties = 0;

        Class type = element.getClass();

        for (Field field : ReflectionUtils.getAllFields(type)) {
            Class t = field.getType();
            if (t.isPrimitive())    {
                simpleProperties++;
            } else if (t.getSimpleName().equals("String"))  {
                simpleProperties++;
            } else {
                complexProperties++;
            }
        }
        return simpleProperties * 100 / (simpleProperties+complexProperties);
    }
}