package org.bitcoinj.core.listeners;

import org.bitcoinj.core.EmptyMessage;
import org.bitcoinj.core.NetworkParameters;

/**
 * Created by HashEngineering on 8/11/2017.
 */
public class SendHeadersMessage extends EmptyMessage{
    public SendHeadersMessage(NetworkParameters params){
        super(params);
    }
}
