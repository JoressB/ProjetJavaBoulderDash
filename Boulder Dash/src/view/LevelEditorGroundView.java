package view;

import controller.LevelEditorKeyController;
import model.Level;
import view.GroundView;
import view.LevelEditor;


/**
 * LevelEditorFieldView
 *
 * Game field view for the level editor.
 *
 * @author      Clarette ATAGANA
 * @since       2015-06-21
 */
public class LevelEditorGroundView extends GroundView {
    /**
     * Class constructor
     *
     * @param  level  Level model
     */
    public LevelEditorGroundView(Level level, LevelEditor levelEditor) {
        super(level);

        this.addKeyListener(new LevelEditorKeyController(level, levelEditor));
    }
}
