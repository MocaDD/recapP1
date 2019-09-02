import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;

public class PercentageRatio {

    public <E> String identifyFiels(E element) {

        Class type = element.getClass();
        StringBuilder str = new StringBuilder();

        for (Field field : ReflectionUtils.getAllFields(type)) {
            Class t = field.getType();
            str.append(t.getSimpleName() + "/");
        }
        System.out.println(str);
        return str.toString();
    }

    public <E> double calculatePercentageRatio (E element)   {

        int simpleProperties = 0;
        int complexProperties = 0;
        String parts[] = identifyFiels(element).split("/");

        for (String a : parts)
        {
            switch(a)
            {
                case "String":
                    simpleProperties++;
                    break;
                case "Integer":
                    simpleProperties++;
                    break;
                case "boolean":
                    simpleProperties++;
                    break;
                case "double":
                    simpleProperties++;
                    break;
                case "int":
                    simpleProperties++;
                    break;
                case "float":
                    simpleProperties++;
                    break;
                default:
                    complexProperties++;
            }
        }

        return simpleProperties * 100 / (simpleProperties+complexProperties);
    }
}