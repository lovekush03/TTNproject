package com.ttn.project.core.models.Impl;

import com.ttn.project.core.models.CheckboxModel;
import com.ttn.project.core.service.CheckboxService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

@Model(adaptables = Resource.class, adapters = CheckboxModel.class)
public class CheckboxModelImpl implements CheckboxModel {
    //Inject OSGi service
    @OSGiService
    private CheckboxService checkboxService;

    @Override
    public boolean getIsChecked() {
        return checkboxService.getIsChecked();
    }
}
