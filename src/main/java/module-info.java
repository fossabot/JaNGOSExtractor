/*
 * Copyright (C) 2019 Warkdev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

module eu.jangos.extractor {
    requires logback.classic;
    requires logback.core;
    requires slf4j.api;    
    requires obj;
    requires eu.jangos.utils;
    requires org.apache.commons.io;
    requires org.apache.commons.lang3;    
    requires javafx.controls;            
    requires systems.crigges.jmpq;
    requires javafx.swing;
        
    exports eu.jangos.extractor.file;
    exports eu.jangos.extractor.file.exception;
    exports eu.jangos.extractor.file.impl;
    exports eu.jangos.extractor.rendering;
}