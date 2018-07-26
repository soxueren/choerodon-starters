package io.choerodon.asgard.saga;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "choerodon.saga.consumer")
public class ChoerodonSagaProperties {

    private Integer pollInterval = 1;

    private Integer threadNum = 5;

    private Boolean enabled = true;

    public Integer getPollInterval() {
        return pollInterval;
    }

    public void setPollInterval(Integer pollInterval) {
        this.pollInterval = pollInterval;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getThreadNum() {
        return threadNum;
    }

    public void setThreadNum(Integer threadNum) {
        this.threadNum = threadNum;
    }
}
