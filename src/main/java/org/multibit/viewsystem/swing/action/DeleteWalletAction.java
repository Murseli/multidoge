/**
 * Copyright 2012 multibit.org
 *
 * Licensed under the MIT license (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://opensource.org/licenses/mit-license.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.multibit.viewsystem.swing.action;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.multibit.controller.MultiBitController;
import org.multibit.file.FileHandler;
import org.multibit.model.MultiBitModel;
import org.multibit.model.PerWalletModelData;
import org.multibit.model.WalletInfo;
import org.multibit.model.WalletInfoException;
import org.multibit.viewsystem.swing.MultiBitFrame;
import org.multibit.viewsystem.swing.view.WalletFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.bitcoin.core.ECKey;
import com.google.bitcoin.core.Wallet;

/**
 * This {@link Action}deletes a wallet
 */
public class DeleteWalletAction extends AbstractAction {

    private static final Logger log = LoggerFactory.getLogger(DeleteWalletAction.class);

    private static final long serialVersionUID = 1923933460523457765L;

    private MultiBitController controller;
    private MultiBitFrame mainFrame;

    /**
     * Creates a new {@link DeleteWalletAction}.
     */
    public DeleteWalletAction(MultiBitController controller, ImageIcon icon, MultiBitFrame mainFrame) {
        super(controller.getLocaliser().getString("deleteWalletAction.text"), icon);
        this.controller = controller;
        this.mainFrame = mainFrame;

        MnemonicUtil mnemonicUtil = new MnemonicUtil(controller.getLocaliser());
        putValue(SHORT_DESCRIPTION, controller.getLocaliser().getString("deleteWalletAction.tooltip"));
        putValue(MNEMONIC_KEY, mnemonicUtil.getMnemonic("deleteWalletAction.mnemonicKey"));
    }

    /**
     * delete a wallet
     */
    public void actionPerformed(ActionEvent e) {
        mainFrame.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        setEnabled(false);

        try {
            // TODO
            JOptionPane.showMessageDialog(mainFrame, "Delete wallet - TODO", "Delete wallet - TODO", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            setEnabled(true);
            mainFrame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }
}