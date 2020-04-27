package com.zeaho.grpc.client;

import com.zeaho.grpc.util.BuildClientUtils;
import com.zeaho.proto.water.WaterCompanyGrpc;
import com.zeaho.proto.water.WaterReply;
import com.zeaho.proto.water.WaterRequest;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author lzzz
 * @since 2020-04-25 17:09
 */
public class WaterBlockingClient {
    private static final Logger logger = Logger.getLogger(WaterBlockingClient.class.getName());

    private final WaterCompanyGrpc.WaterCompanyBlockingStub futureStub;

    /** Construct client for accessing HelloWorld server using the existing channel. */
    public WaterBlockingClient(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        futureStub = WaterCompanyGrpc.newBlockingStub(channel);
    }

    /** Say hello to server. */
    public void butWater(float price) {
        logger.info("Will try to buy water " + price + " ...");
        WaterRequest request = WaterRequest.newBuilder().setPrice(price).build();
        WaterReply waterReply;
        try {
            waterReply = futureStub.buyWater(request);
            logger.info("WaterCompany: " + waterReply.getMessage());

        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting. The second argument is the target server.
     */
    public static void main(String[] args) throws Exception {
        BuildClientUtils buildClientUtils = new BuildClientUtils(3.5f, args).invoke();
        float price = buildClientUtils.getPrice();
        ManagedChannel channel = buildClientUtils.getChannel();
        try {
            WaterBlockingClient client = new WaterBlockingClient(channel);
            client.butWater(price);
        } finally {
            // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
            // resources the channel should be shut down when it will no longer be used. If it may be used
            // again leave it running.
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}
