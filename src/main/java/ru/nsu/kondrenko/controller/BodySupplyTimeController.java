package ru.nsu.kondrenko.controller;

import ru.nsu.kondrenko.model.Emulator;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BodySupplyTimeController implements ChangeListener {
    private Emulator emulator;

    public void setEmulator(Emulator emulator) {
        this.emulator = emulator;
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        emulator.setBodySupplyTime(Utils.getValueFromSliderEvent(changeEvent));
    }
}
