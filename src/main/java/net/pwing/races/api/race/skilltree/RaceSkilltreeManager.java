package net.pwing.races.api.race.skilltree;

import java.util.List;

/**
 * RaceSkilltreeManager API implementation
 *
 * @author Redned
 */
public interface RaceSkilltreeManager {

    /**
     * Returns the skilltree with the specified name
     *
     * @param name the name of the skilltree
     * @return the skilltree with the specified name
     */
    RaceSkilltree getSkilltreeFromName(String name);

    /**
     * Returns a list of the skilltrees
     *
     * @return a list of the skilltrees
     */
    List<RaceSkilltree> getSkilltrees();
}
