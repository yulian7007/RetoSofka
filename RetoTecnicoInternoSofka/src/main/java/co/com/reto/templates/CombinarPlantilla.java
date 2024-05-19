package co.com.reto.templates;

import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

public class CombinarPlantilla {

    private final String templateFile;

    private static final ConfigurarPlantilla CONFIGURAR_PLANTILLA = new ConfigurarPlantilla();

    public CombinarPlantilla(String templateFile) {
        this.templateFile = templateFile;
    }

    public static CombinarPlantilla template(String template) {
        return new CombinarPlantilla(template);
    }

    public String withFieldsFrom(Map<String, String> fieldValues) {
        Template template = CONFIGURAR_PLANTILLA.getTemplate(templateFile);

        Writer writer = new StringWriter();

        try {
            template.process(fieldValues, writer);
        } catch (TemplateException | IOException e) {
            throw new IllegalStateException("Failed to merge test data template", e);
        }

        return writer.toString();
    }

}
