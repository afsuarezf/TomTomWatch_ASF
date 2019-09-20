/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.studioblueplanet.tomtomwatch;

/**
 * Defines the commands that can be issued to the processing thread
 * @author jorgen.van.der.velde
 */
public enum ThreadCommand
{
    THREADCOMMAND_CONNECT,
    THREADCOMMAND_GETDEVICESERIAL,
    THREADCOMMAND_GETTIME,
    THREADCOMMAND_SYNCTIME,
    THREADCOMMAND_DOWNLOAD,
    THREADCOMMAND_DELETETTBINFILES,
    THREADCOMMAND_UPLOADGPSDATA,
    THREADCOMMAND_PREFERENCES,
    THREADCOMMAND_DELETEPREFERENCES,
    THREADCOMMAND_SHOWWATCHSETTINGS,
    THREADCOMMAND_GETNAME,
    THREADCOMMAND_SETNAME,

    THREADCOMMAND_DOWNLOADROUTES,
    THREADCOMMAND_UPLOADROUTE,
    THREADCOMMAND_UPLOADROUTES,
    THREADCOMMAND_CLEARROUTES,
    THREADCOMMAND_LISTHISTORYSUMMARY,
    THREADCOMMAND_LISTHISTORY,
    THREADCOMMAND_LISTRACES,
    TRHEADCOMMAND_CLEARDATA,
    THREADCOMMAND_LISTTRACKEDACTIVITY,
    THREADCOMMAND_DELETETRACKEDACTIVITY,
    
    THREADCOMMAND_LISTFILES,
    THREADCOMMAND_SHOWFILE,
    THREADCOMMAND_SAVEFILE,
    THREADCOMMAND_UPLOADFILE,
    THREADCOMMAND_DELETEFILE,
    THREADCOMMAND_REBOOT,
    THREADCOMMAND_FACTORYRESET,
    THREADCOMMAND_SAVESIMULATIONSET,
    THREADCOMMAND_LOADTTBINFILE,
    
    THREADCOMMAND_GETPRODUCTID,
    THREADCOMMAND_GETFIRMWAREVERSION,
    THREADCOMMAND_UPDATEFIRMWARE,
    
    THREADCOMMAND_NONE    
}
