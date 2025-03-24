package com.ttn.project.core.config;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
        name="Checkbox Configuration",
        description = "Checkbox Configuration for Checkbox Component")
public @interface CheckboxConfig {
    boolean isChecked() default false;
}
