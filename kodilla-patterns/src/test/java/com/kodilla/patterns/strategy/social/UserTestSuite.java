package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User oldMan = new YGeneration("OldMan");
        User man = new Millenials("Man");
        User youngMan = new ZGeneration("YoungMan");
        //When
        String oldManSharing = oldMan.sharing();
        String manSharing = man.sharing();
        String youngManSharing = youngMan.sharing();


        //Then
        assertEquals("FacebookPublisher", oldManSharing);
        assertEquals("TwitterPublisher", manSharing);
        assertEquals("SnapchatPublisher", youngManSharing);

    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        User oldMan = new YGeneration("OldMan");

        //When
        oldMan.setSocialPublisher(new SnapchatPublisher());
        String oldManSharing = oldMan.sharing();

        //Then
        assertEquals("SnapchatPublisher", oldManSharing);
    }
}
