package io.alauda.jenkins.devops.sync;

import hudson.Extension;
import hudson.Plugin;

@Extension
public class AlaudaSyncPlugin extends Plugin {
    @Override
    public void postInitialize() throws Exception {
        AlaudaSyncGlobalConfiguration.get().configChange();
    }
}
