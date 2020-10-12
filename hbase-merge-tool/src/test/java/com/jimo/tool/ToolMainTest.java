package com.jimo.tool;

import com.beust.jcommander.JCommander;
import com.jimo.tool.arg.CmdMerge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ToolMainTest {

    @Test
    void testMergeCmdArg() {
        final CmdMerge cmdMerge = new CmdMerge();
        final JCommander cmd = JCommander.newBuilder()
                .addObject(new ToolMainTest())
                .addCommand("merge", cmdMerge)
                .build();

        cmd.parse("merge", "--zkQuorum", "zk1", "table01");

        assertEquals("merge", cmd.getParsedCommand());
        assertEquals("zk1", cmdMerge.zkQuorum);
        assertEquals("table01", cmdMerge.tablePattern);
        assertFalse(cmdMerge.isRegex);
    }
}
