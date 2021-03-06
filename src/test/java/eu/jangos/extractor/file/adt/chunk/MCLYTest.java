/*
 * Copyright (C) 2019 Warkdev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.jangos.extractor.file.adt.chunk;

import eu.jangos.extractor.file.adt.chunk.MCLY;
import eu.jangos.test.utils.ByteBufferUtils;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Warkdev
 */
public class MCLYTest {

    /**
     * Test of read method, of class MCLY.
     */
    @Test
    public void testRead() throws IOException {        
        ByteBuffer in = ByteBufferUtils.getByteBuffer("legit/adt/MCLY/mcly001");
        MCLY instance = new MCLY();
        instance.read(in);
        assertEquals(18, instance.getTextureId());
        assertEquals(38, instance.getFlags());
        assertEquals(0, instance.getOffsetinMCAL());
        assertEquals(0, instance.getEffectId());        
    }    
    
    @Test
    public void testReadWrongMCIN() throws IOException {
        MCIN instance = new MCIN();
        ByteBuffer in = ByteBufferUtils.getByteBuffer("legit/adt/MCLY/mcly002");
        assertThrows(BufferUnderflowException.class, () -> {
            instance.read(in);
        });        
    }
}
