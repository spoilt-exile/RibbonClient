/**
 * This file is part of libRibbonApp library (check README).
 * Copyright (C) 2013 Stanislav Nepochatov
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
**/

package ribbonclient;

/**
 * libRibbonApp.AppComponents.NetWorker child class with listensers.
 * @see AppComponents.NetWorker
 * @author Stanislav Nepochatov <spoilt.exile@gmail.com>
 */
public class ClientWorker extends AppComponents.NetWorker {
    
    /**
     * Default constructor.
     * @param givenApp linked application object;
     */
    public ClientWorker(AppComponents.RibbonApplication givenApp) {
        super(givenApp);
    }
    
    @Override
    public AppComponents.Listener[] getProtocol() {
        return new AppComponents.Listener[] {
            new AppComponents.Listener("RIBBON_GCTL_FORCE_LOGIN") {

            @Override
            public void exec(String args) {
                currentApplication.log(2, "потребує авторізацію!");
            }
        }
        };
    }
}
