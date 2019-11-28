package net.pwing.races.api.race.skilltree;

import java.util.List;
import java.util.Optional;

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
    default Optional<RaceSkilltree> getSkilltreeFromName(String name) {
        for (RaceSkilltree skilltree : getSkilltrees()) {
            if (skilltree.getName().equalsIgnoreCase(name) || skilltree.getInternalName().equalsIgnoreCase(name))
                return Optional.of(skilltree);
        }

        return Optional.empty();
    }

    /**
     * Returns a list of the skilltrees
     *
     * @return a list of the skilltrees
     */
    List<RaceSkilltree> getSkilltrees();
}
