package t3209.actions;

import javax.swing.*;

import t3209.View;

import java.awt.event.ActionEvent;

/**
 * Created by DELL on 11/16/2017.
 */
public class UndoAction extends AbstractAction {
    private View view;
    @Override
    public void actionPerformed(ActionEvent e) {
        view.undo();
    }

    public UndoAction(View view) {
        this.view = view;
    }
}
