package me.StevenLawson.TotalFreedomMod.Commands;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "For Devs Testing Commands!", usage = "/<command> [on | off]")
public class Command_devmode extends TFM_Command
{

@Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length != 1)
        {
            return false;
        }

        if (args[0].equalsIgnoreCase("off"))
        {
           
            TFM_Util.adminAction(sender.getName(), "DevMode has been turned off!", true);
            return true;
        }
        else if (args[0].equalsIgnoreCase("on"))
        {
            
            TFM_Util.adminAction(sender.getName(), "DevMode has been enabled, warning: Weird Stuff Might Happen!.", true);
            
            {
