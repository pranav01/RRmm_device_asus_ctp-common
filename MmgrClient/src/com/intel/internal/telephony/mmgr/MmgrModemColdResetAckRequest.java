/* Android Modem Status Client API
 *
 * Copyright (C) Intel 2012
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.intel.internal.telephony.mmgr;

import com.intel.internal.telephony.ModemRequestArgs;
import java.nio.ByteBuffer;

public class MmgrModemColdResetAckRequest extends ModemRequestArgs {
    @Override
    public byte[] getFrame() {
        ByteBuffer ret = ByteBuffer.allocate(8);

        ret.putInt(MedfieldMmgrClient.ACK_MODEM_COLD_RESET);
        ret.putInt(super.getTimestamp());

        return ret.array();
    }

    @Override
    public String getName() {
        return "ModemColdResetAckRequest";
    }
}
