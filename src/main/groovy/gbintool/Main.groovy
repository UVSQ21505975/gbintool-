package gbintool
import groovy.util.CliBuilder

class Main {

     String returnHello() {
        'Hello'
                          }
    static void main(def args) {
            def cli = new CliBuilder(usage:'TestCliBuilder')
	    cli.with {
	     h longOpt:'help: usage', 'permet d\'afficher lusage de la commande'
	      c longOpt:'Ecriture:fichier',argName:'path', args:2, type:String.class, required: false,valueSeparator: ',' as char, 'syntaxe: -c fileName,text'
	       s longOpt:'Lecture:fichier',argName:'path', args:1, type:String.class, required: false, 'Afficher le contenu du fichier'
	       }
	               def op = cli.parse(args)
		               if (op.h)
			                       cli.usage()
					               if(op.c)
						       {
						                       
								       File file = new File(op.cs[0])
								             file.write "${op.cs[1]}"
									           println "Le Fichier a ete bien cree"
										   }
										      
										      if(op.s)
										      {
										          
											      File file = new File(op.s)
											          if(file.exists() && !file.isDirectory()) { 
												      println file.text
												      }
												      else
												      {
												         println " il n'existe aucun fichier de ce nom "
													 }

													 }
													 }
													 }
