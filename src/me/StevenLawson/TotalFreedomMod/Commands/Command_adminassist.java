package me.StevenLawson.TotalFreedomMod.Commands;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = " Call a admin for help .", usage = "/<command>, aliases = "aa")
public class Command_aa extends TFM_Command
{

@Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
    TFM_Util.bcastMsg(ChatColor.RED + sender.getName() + " Needs help, Admins come now!!! ");
    playerMsg(ChatColor.GREEN + " A Admin is on its way! ");
    return true;
    }
}
    
