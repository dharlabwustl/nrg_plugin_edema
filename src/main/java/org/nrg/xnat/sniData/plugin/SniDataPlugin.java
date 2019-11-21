/*
 * xnat-sniData-Plugin: org.nrg.xnat.sniData.plugin.sniDataPlugin
 * XNAT http://www.xnat.org
 * Copyright (c) 2018, Washington University School of Medicine
 * All Rights Reserved
 *
 * Released under the Simplified BSD.
 */

package org.nrg.xnat.sniData.plugin;

import org.nrg.framework.annotations.XnatDataModel;
import org.nrg.framework.annotations.XnatPlugin;

@XnatPlugin(value = "sniDataPlugin", name = "XNAT 1.7 Plugin for showing Stroke_Edema Pipeline output Results",
            dataModels = {@XnatDataModel(value = "sni:sniData",
                                         singular = "Stroke Edema",
                                         plural = "Stroke Edema")})
public class SniDataPlugin {
}



