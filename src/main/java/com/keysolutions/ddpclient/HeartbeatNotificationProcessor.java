package com.keysolutions.ddpclient;

import com.jazeee.common.notifier.INotificationProcessor;
import com.jazeee.common.utils.nullability.NotNull;
import com.jazeee.ddp.listeners.IDdpHeartbeatListener;
import com.jazeee.ddp.messages.client.heartbeat.IDdpClientHeartbeatMessage;

public class HeartbeatNotificationProcessor implements INotificationProcessor<IDdpHeartbeatListener, IDdpClientHeartbeatMessage> {
	@Override
	public void notifyListener(@NotNull IDdpHeartbeatListener listener, @NotNull IDdpClientHeartbeatMessage ddpClientHeartbeatMessage) {
		assert (listener != null);
		assert (ddpClientHeartbeatMessage != null);
		listener.processMessage(ddpClientHeartbeatMessage);
	}
}
