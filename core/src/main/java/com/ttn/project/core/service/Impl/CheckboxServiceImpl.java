package com.ttn.project.core.service.Impl;

import com.ttn.project.core.config.CheckboxConfig;
import com.ttn.project.core.service.CheckboxService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = CheckboxService.class, immediate = true)
@Designate(ocd = CheckboxConfig.class)
public class CheckboxServiceImpl implements CheckboxService {

    private Boolean checked;

    @Activate
    @Modified
    void activate(CheckboxConfig config) {
        checked = config.isChecked();
    }

    @Override
    public boolean getIsChecked() {
        return checked;
    }
}
