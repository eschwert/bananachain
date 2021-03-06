package org.madoke.bananachain.node.handlers;

import org.madoke.bananachain.BananaChain;
import ratpack.handling.Context;
import ratpack.handling.Handler;

import javax.inject.Inject;

import static ratpack.jackson.Jackson.json;

public class GetMemPoolHandler implements Handler {

    private final BananaChain bananaChain;

    @Inject
    public GetMemPoolHandler(BananaChain bananaChain) {
        this.bananaChain = bananaChain;
    }

    @Override
    public void handle(Context ctx) throws Exception {
        ctx.render(json(bananaChain.getMempool()));
    }
}
