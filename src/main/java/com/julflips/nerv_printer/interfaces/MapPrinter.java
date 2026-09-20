package com.julflips.nerv_printer.interfaces;

import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public interface MapPrinter {

    void setInterval(Pair<Integer, Integer> interval);

    void mineLine(int minedLines);

    void addError(BlockPos relativeBlockPos);

    void pause();

    void start();

    boolean isActive();

    void toggle();

    boolean getActivationReset();

    void skipBuilding();

    void slaveFinished(String slave);

    /** Name of the master this bot is bound to (persisted between sessions). Empty when this bot is not a slave. */
    String getMasterName();

    void setMasterName(String name);

    /** Names of the bots this module coordinates with (persisted between sessions). */
    List<String> getSlaveNames();

    void setSlaveNames(List<String> names);

    /** Called when a slave (re)registered, so it can catch up with a print that is already running. */
    void slaveJoined(String slave);
}
