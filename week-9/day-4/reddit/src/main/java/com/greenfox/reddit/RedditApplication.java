package com.greenfox.reddit;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {
  @Autowired
  private PostRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new Post("Sell my kidney", "For money"));
    repository.save(new Post("Learn object relational mapping", "<iframe src=\"https://giphy.com/embed/JIX9t2j0ZTN9S\" width=\"480\" height=\"480\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/JIX9t2j0ZTN9S\">via GIPHY</a></p>"));
    repository.save(new Post("Just another post","<iframe src=\"https://giphy.com/embed/mlvseq9yvZhba\" width=\"480\" height=\"480\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/funny-cat-mlvseq9yvZhba\">via GIPHY</a></p>"));
    repository.save(new Post("Brewing beer is fun!","<blockquote class=\"instagram-media\" data-instgrm-captioned data-instgrm-permalink=\"https://www.instagram.com/p/BrIskwIgqos/?utm_source=ig_embed&amp;utm_medium=loading\" data-instgrm-version=\"12\" style=\" background:#FFF; border:0; border-radius:3px; box-shadow:0 0 1px 0 rgba(0,0,0,0.5),0 1px 10px 0 rgba(0,0,0,0.15); margin: 1px; max-width:540px; min-width:326px; padding:0; width:99.375%; width:-webkit-calc(100% - 2px); width:calc(100% - 2px);\"><div style=\"padding:16px;\"> <a href=\"https://www.instagram.com/p/BrIskwIgqos/?utm_source=ig_embed&amp;utm_medium=loading\" style=\" background:#FFFFFF; line-height:0; padding:0 0; text-align:center; text-decoration:none; width:100%;\" target=\"_blank\"> <div style=\" display: flex; flex-direction: row; align-items: center;\"> <div style=\"background-color: #F4F4F4; border-radius: 50%; flex-grow: 0; height: 40px; margin-right: 14px; width: 40px;\"></div> <div style=\"display: flex; flex-direction: column; flex-grow: 1; justify-content: center;\"> <div style=\" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; margin-bottom: 6px; width: 100px;\"></div> <div style=\" background-color: #F4F4F4; border-radius: 4px; flex-grow: 0; height: 14px; width: 60px;\"></div></div></div><div style=\"padding: 19% 0;\"></div><div style=\"display:block; height:50px; margin:0 auto 12px; width:50px;\"><svg width=\"50px\" height=\"50px\" viewBox=\"0 0 60 60\" version=\"1.1\" xmlns=\"https://www.w3.org/2000/svg\" xmlns:xlink=\"https://www.w3.org/1999/xlink\"><g stroke=\"none\" stroke-width=\"1\" fill=\"none\" fill-rule=\"evenodd\"><g transform=\"translate(-511.000000, -20.000000)\" fill=\"#000000\"><g><path d=\"M556.869,30.41 C554.814,30.41 553.148,32.076 553.148,34.131 C553.148,36.186 554.814,37.852 556.869,37.852 C558.924,37.852 560.59,36.186 560.59,34.131 C560.59,32.076 558.924,30.41 556.869,30.41 M541,60.657 C535.114,60.657 530.342,55.887 530.342,50 C530.342,44.114 535.114,39.342 541,39.342 C546.887,39.342 551.658,44.114 551.658,50 C551.658,55.887 546.887,60.657 541,60.657 M541,33.886 C532.1,33.886 524.886,41.1 524.886,50 C524.886,58.899 532.1,66.113 541,66.113 C549.9,66.113 557.115,58.899 557.115,50 C557.115,41.1 549.9,33.886 541,33.886 M565.378,62.101 C565.244,65.022 564.756,66.606 564.346,67.663 C563.803,69.06 563.154,70.057 562.106,71.106 C561.058,72.155 560.06,72.803 558.662,73.347 C557.607,73.757 556.021,74.244 553.102,74.378 C549.944,74.521 548.997,74.552 541,74.552 C533.003,74.552 532.056,74.521 528.898,74.378 C525.979,74.244 524.393,73.757 523.338,73.347 C521.94,72.803 520.942,72.155 519.894,71.106 C518.846,70.057 518.197,69.06 517.654,67.663 C517.244,66.606 516.755,65.022 516.623,62.101 C516.479,58.943 516.448,57.996 516.448,50 C516.448,42.003 516.479,41.056 516.623,37.899 C516.755,34.978 517.244,33.391 517.654,32.338 C518.197,30.938 518.846,29.942 519.894,28.894 C520.942,27.846 521.94,27.196 523.338,26.654 C524.393,26.244 525.979,25.756 528.898,25.623 C532.057,25.479 533.004,25.448 541,25.448 C548.997,25.448 549.943,25.479 553.102,25.623 C556.021,25.756 557.607,26.244 558.662,26.654 C560.06,27.196 561.058,27.846 562.106,28.894 C563.154,29.942 563.803,30.938 564.346,32.338 C564.756,33.391 565.244,34.978 565.378,37.899 C565.522,41.056 565.552,42.003 565.552,50 C565.552,57.996 565.522,58.943 565.378,62.101 M570.82,37.631 C570.674,34.438 570.167,32.258 569.425,30.349 C568.659,28.377 567.633,26.702 565.965,25.035 C564.297,23.368 562.623,22.342 560.652,21.575 C558.743,20.834 556.562,20.326 553.369,20.18 C550.169,20.033 549.148,20 541,20 C532.853,20 531.831,20.033 528.631,20.18 C525.438,20.326 523.257,20.834 521.349,21.575 C519.376,22.342 517.703,23.368 516.035,25.035 C514.368,26.702 513.342,28.377 512.574,30.349 C511.834,32.258 511.326,34.438 511.181,37.631 C511.035,40.831 511,41.851 511,50 C511,58.147 511.035,59.17 511.181,62.369 C511.326,65.562 511.834,67.743 512.574,69.651 C513.342,71.625 514.368,73.296 516.035,74.965 C517.703,76.634 519.376,77.658 521.349,78.425 C523.257,79.167 525.438,79.673 528.631,79.82 C531.831,79.965 532.853,80.001 541,80.001 C549.148,80.001 550.169,79.965 553.369,79.82 C556.562,79.673 558.743,79.167 560.652,78.425 C562.623,77.658 564.297,76.634 565.965,74.965 C567.633,73.296 568.659,71.625 569.425,69.651 C570.167,67.743 570.674,65.562 570.82,62.369 C570.966,59.17 571,58.147 571,50 C571,41.851 570.966,40.831 570.82,37.631\"></path></g></g></g></svg></div><div style=\"padding-top: 8px;\"> <div style=\" color:#3897f0; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:550; line-height:18px;\"> A bejegyzés megtekintése az Instagramon</div></div><div style=\"padding: 12.5% 0;\"></div> <div style=\"display: flex; flex-direction: row; margin-bottom: 14px; align-items: center;\"><div> <div style=\"background-color: #F4F4F4; border-radius: 50%; height: 12.5px; width: 12.5px; transform: translateX(0px) translateY(7px);\"></div> <div style=\"background-color: #F4F4F4; height: 12.5px; transform: rotate(-45deg) translateX(3px) translateY(1px); width: 12.5px; flex-grow: 0; margin-right: 14px; margin-left: 2px;\"></div> <div style=\"background-color: #F4F4F4; border-radius: 50%; height: 12.5px; width: 12.5px; transform: translateX(9px) translateY(-18px);\"></div></div><div style=\"margin-left: 8px;\"> <div style=\" background-color: #F4F4F4; border-radius: 50%; flex-grow: 0; height: 20px; width: 20px;\"></div> <div style=\" width: 0; height: 0; border-top: 2px solid transparent; border-left: 6px solid #f4f4f4; border-bottom: 2px solid transparent; transform: translateX(16px) translateY(-4px) rotate(30deg)\"></div></div><div style=\"margin-left: auto;\"> <div style=\" width: 0px; border-top: 8px solid #F4F4F4; border-right: 8px solid transparent; transform: translateY(16px);\"></div> <div style=\" background-color: #F4F4F4; flex-grow: 0; height: 12px; width: 16px; transform: translateY(-4px);\"></div> <div style=\" width: 0; height: 0; border-top: 8px solid #F4F4F4; border-left: 8px solid transparent; transform: translateY(-4px) translateX(8px);\"></div></div></div></a> <p style=\" margin:8px 0 0 0; padding:0 4px;\"> <a href=\"https://www.instagram.com/p/BrIskwIgqos/?utm_source=ig_embed&amp;utm_medium=loading\" style=\" color:#000; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:normal; line-height:17px; text-decoration:none; word-wrap:break-word;\" target=\"_blank\">The beginning of something beautiful! #beer #brewing #friends #sonyalpha #sonya7 #a036 #malt #ale #diy #fornewyear #beerbrewing #homebrew @poordanika @kotaiaron @te.szter @horvath.vi @borbelyannamaria</a></p> <p style=\" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; line-height:17px; margin-bottom:0; margin-top:8px; overflow:hidden; padding:8px 0 7px; text-align:center; text-overflow:ellipsis; white-space:nowrap;\"><a href=\"https://www.instagram.com/rbkoronczi/?utm_source=ig_embed&amp;utm_medium=loading\" style=\" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:normal; line-height:17px;\" target=\"_blank\"> Richard Koronczi</a> (@rbkoronczi) által megosztott bejegyzés, <time style=\" font-family:Arial,sans-serif; font-size:14px; line-height:17px;\" datetime=\"2018-12-08T18:09:37+00:00\">Dec 8., 2018, időpont: 10:09 (PST időzóna szerint)</time></p></div></blockquote> <script async src=\"//www.instagram.com/embed.js\"></script>"));
    repository.save(new Post("Nothing to see here, move along","<iframe src=\"https://giphy.com/embed/10RgsuetO4uDkY\" width=\"480\" height=\"324\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/shop-iowa-gift-10RgsuetO4uDkY\">via GIPHY</a></p>"));
    repository.save(new Post("Style above all","<iframe src=\"https://giphy.com/embed/ORTvuDQeKiqcTLPxsV\" width=\"480\" height=\"442\" frameBorder=\"0\" class=\"giphy-embed\" allowFullScreen></iframe><p><a href=\"https://giphy.com/gifs/nerdist-star-wars-solo-ORTvuDQeKiqcTLPxsV\">via GIPHY</a></p>"));
    repository.save(new Post("Check my awesome ToDo app!","<a href=\"https://calm-inlet-17473.herokuapp.com/\">Link</a>"));
    repository.save(new Post("Writing posts can get sooo boring...","BOOOOOOOOOORIIIIING"));
    repository.save(new Post("Writing posts can get sooo boring...","BOOOOOOOOOORIIIIING"));
    repository.save(new Post("Writing posts can get sooo boring...","BOOOOOOOOOORIIIIING"));
    repository.save(new Post("Writing posts can get sooo boring...","BOOOOOOOOOORIIIIING"));
    repository.save(new Post("Writing posts can get sooo boring...","BOOOOOOOOOORIIIIING"));
    repository.save(new Post("Writing posts can get sooo boring...","BOOOOOOOOOORIIIIING"));
    repository.save(new Post("Writing posts can get sooo boring...","BOOOOOOOOOORIIIIING"));
    repository.save(new Post("Foreword of clean code","Foreword\n" +
        "One of our favorite candies here in Denmark is Ga-Jol, whose strong licorice vapors are a\n" +
        "perfect complement to our damp and often chilly weather. Part of the charm of Ga-Jol to\n" +
        "us Danes is the wise or witty sayings printed on the flap of every box top. I bought a twopack\n" +
        "of the delicacy this morning and found that it bore this old Danish saw:\n" +
        "Ærlighed i små ting er ikke nogen lille ting.\n" +
        "“Honesty in small things is not a small thing.” It was a good omen consistent with what I\n" +
        "already wanted to say here. Small things matter. This is a book about humble concerns\n" +
        "whose value is nonetheless far from small.\n" +
        "God is in the details, said the architect Ludwig mies van der Rohe. This quote recalls\n" +
        "contemporary arguments about the role of architecture in software development, and particularly\n" +
        "in the Agile world. Bob and I occasionally find ourselves passionately engaged in\n" +
        "this dialogue. And yes, mies van der Rohe was attentive to utility and to the timeless forms\n" +
        "of building that underlie great architecture. On the other hand, he also personally selected\n" +
        "every doorknob for every house he designed. Why? Because small things matter.\n" +
        "In our ongoing “debate” on TDD, Bob and I have discovered that we agree that software\n" +
        "architecture has an important place in development, though we likely have different\n" +
        "visions of exactly what that means. Such quibbles are relatively unimportant, however,\n" +
        "because we can accept for granted that responsible professionals give some time to thinking\n" +
        "and planning at the outset of a project. The late-1990s notions of design driven only by\n" +
        "the tests and the code are long gone. Yet attentiveness to detail is an even more critical\n" +
        "foundation of professionalism than is any grand vision. First, it is through practice in the\n" +
        "small that professionals gain proficiency and trust for practice in the large. Second, the\n" +
        "smallest bit of sloppy construction, of the door that does not close tightly or the slightly\n" +
        "crooked tile on the floor, or even the messy desk, completely dispels the charm of the\n" +
        "larger whole. That is what clean code is about.\n" +
        "Still, architecture is just one metaphor for software development, and in particular for\n" +
        "that part of software that delivers the initial product in the same sense that an architect\n" +
        "delivers a pristine building. In these days of Scrum and Agile, the focus is on quickly\n" +
        "bringing product to market. We want the factory running at top speed to produce software.\n" +
        "These are human factories: thinking, feeling coders who are working from a product backlog\n" +
        "or user story to create product. The manufacturing metaphor looms ever strong in such\n" +
        "thinking. The production aspects of Japanese auto manufacturing, of an assembly-line\n" +
        "world, inspire much of Scrum.\n" +
        "www.it-ebooks.info\n" +
        "xx Foreword\n" +
        "Yet even in the auto industry, the bulk of the work lies not in manufacturing but in\n" +
        "maintenance—or its avoidance. In software, 80% or more of what we do is quaintly called\n" +
        "“maintenance”: the act of repair. Rather than embracing the typical Western focus on producing\n" +
        "good software, we should be thinking more like home repairmen in the building\n" +
        "industry, or auto mechanics in the automotive field. What does Japanese management have\n" +
        "to say about that?\n" +
        "In about 1951, a quality approach called Total Productive Maintenance (TPM) came\n" +
        "on the Japanese scene. Its focus is on maintenance rather than on production. One of the\n" +
        "major pillars of TPM is the set of so-called 5S principles. 5S is a set of disciplines—and\n" +
        "here I use the term “discipline” instructively. These 5S principles are in fact at the foundations\n" +
        "of Lean—another buzzword on the Western scene, and an increasingly prominent\n" +
        "buzzword in software circles. These principles are not an option. As Uncle Bob relates in\n" +
        "his front matter, good software practice requires such discipline: focus, presence of mind,\n" +
        "and thinking. It is not always just about doing, about pushing the factory equipment to produce\n" +
        "at the optimal velocity. The 5S philosophy comprises these concepts:\n" +
        "• Seiri, or organization (think “sort” in English). Knowing where things are—using\n" +
        "approaches such as suitable naming—is crucial. You think naming identifiers isn’t\n" +
        "important? Read on in the following chapters.\n" +
        "• Seiton, or tidiness (think “systematize” in English). There is an old American saying:\n" +
        "A place for everything, and everything in its place. A piece of code should be where\n" +
        "you expect to find it—and, if not, you should re-factor to get it there.\n" +
        "• Seiso, or cleaning (think “shine” in English): Keep the workplace free of hanging\n" +
        "wires, grease, scraps, and waste. What do the authors here say about littering your\n" +
        "code with comments and commented-out code lines that capture history or wishes for\n" +
        "the future? Get rid of them.\n" +
        "• Seiketsu, or standardization: The group agrees about how to keep the workplace clean.\n" +
        "Do you think this book says anything about having a consistent coding style and set of\n" +
        "practices within the group? Where do those standards come from? Read on.\n" +
        "• Shutsuke, or discipline (self-discipline). This means having the discipline to follow the\n" +
        "practices and to frequently reflect on one’s work and be willing to change.\n" +
        "If you take up the challenge—yes, the challenge—of reading and applying this book,\n" +
        "you’ll come to understand and appreciate the last point. Here, we are finally driving to the\n" +
        "roots of responsible professionalism in a profession that should be concerned with the life\n" +
        "cycle of a product. As we maintain automobiles and other machines under TPM, breakdown\n" +
        "maintenance—waiting for bugs to surface—is the exception. Instead, we go up a\n" +
        "level: inspect the machines every day and fix wearing parts before they break, or do the\n" +
        "equivalent of the proverbial 10,000-mile oil change to forestall wear and tear. In code,\n" +
        "refactor mercilessly. You can improve yet one level further, as the TPM movement innovated\n" +
        "over 50 years ago: build machines that are more maintainable in the first place. Making\n" +
        "your code readable is as important as making it executable. The ultimate practice,\n" +
        "introduced in TPM circles around 1960, is to focus on introducing entire new machines or\n" +
        "www.it-ebooks.info\n" +
        "Foreword xxi\n" +
        "replacing old ones. As Fred Brooks admonishes us, we should probably re-do major software\n" +
        "chunks from scratch every seven years or so to sweep away creeping cruft. Perhaps\n" +
        "we should update Brooks’ time constant to an order of weeks, days or hours instead of\n" +
        "years. That’s where detail lies.\n" +
        "There is great power in detail, yet there is something humble and profound about this\n" +
        "approach to life, as we might stereotypically expect from any approach that claims Japanese\n" +
        "roots. But this is not only an Eastern outlook on life; English and American folk wisdom\n" +
        "are full of such admonishments. The Seiton quote from above flowed from the pen of\n" +
        "an Ohio minister who literally viewed neatness “as a remedy for every degree of evil.”\n" +
        "How about Seiso? Cleanliness is next to godliness. As beautiful as a house is, a messy\n" +
        "desk robs it of its splendor. How about Shutsuke in these small matters? He who is faithful\n" +
        "in little is faithful in much. How about being eager to re-factor at the responsible time,\n" +
        "strengthening one’s position for subsequent “big” decisions, rather than putting it off? A\n" +
        "stitch in time saves nine. The early bird catches the worm. Don’t put off until tomorrow\n" +
        "what you can do today. (Such was the original sense of the phrase “the last responsible\n" +
        "moment” in Lean until it fell into the hands of software consultants.) How about calibrating\n" +
        "the place of small, individual efforts in a grand whole? Mighty oaks from little acorns\n" +
        "grow. Or how about integrating simple preventive work into everyday life? An ounce of\n" +
        "prevention is worth a pound of cure. An apple a day keeps the doctor away. Clean code\n" +
        "honors the deep roots of wisdom beneath our broader culture, or our culture as it once was,\n" +
        "or should be, and can be with attentiveness to detail.\n" +
        "Even in the grand architectural literature we find saws that hark back to these supposed\n" +
        "details. Think of mies van der Rohe’s doorknobs. That’s seiri. That’s being attentive\n" +
        "to every variable name. You should name a variable using the same care with which you\n" +
        "name a first-born child.\n" +
        "As every homeowner knows, such care and ongoing refinement never come to an end.\n" +
        "The architect Christopher Alexander—father of patterns and pattern languages—views\n" +
        "every act of design itself as a small, local act of repair. And he views the craftsmanship of\n" +
        "fine structure to be the sole purview of the architect; the larger forms can be left to patterns\n" +
        "and their application by the inhabitants. Design is ever ongoing not only as we add a new\n" +
        "room to a house, but as we are attentive to repainting, replacing worn carpets, or upgrading\n" +
        "the kitchen sink. Most arts echo analogous sentiments. In our search for others who\n" +
        "ascribe God’s home as being in the details, we find ourselves in the good company of the\n" +
        "19th century French author Gustav Flaubert. The French poet Paul Valery advises us that a\n" +
        "poem is never done and bears continual rework, and to stop working on it is abandonment.\n" +
        "Such preoccupation with detail is common to all endeavors of excellence. So maybe there\n" +
        "is little new here, but in reading this book you will be challenged to take up good disciplines\n" +
        "that you long ago surrendered to apathy or a desire for spontaneity and just\n" +
        "“responding to change.”\n" +
        "Unfortunately, we usually don’t view such concerns as key cornerstones of the art of\n" +
        "programming. We abandon our code early, not because it is done, but because our value\n" +
        "system focuses more on outward appearance than on the substance of what we deliver.\n" +
        "www.it-ebooks.info\n" +
        "xxii Foreword\n" +
        "This inattentiveness costs us in the end: A bad penny always shows up. Research, neither in\n" +
        "industry nor in academia, humbles itself to the lowly station of keeping code clean. Back\n" +
        "in my days working in the Bell Labs Software Production Research organization (Production,\n" +
        "indeed!) we had some back-of-the-envelope findings that suggested that consistent\n" +
        "indentation style was one of the most statistically significant indicators of low bug density.\n" +
        "We want it to be that architecture or programming language or some other high notion\n" +
        "should be the cause of quality; as people whose supposed professionalism owes to the\n" +
        "mastery of tools and lofty design methods, we feel insulted by the value that those factoryfloor\n" +
        "machines, the coders, add through the simple consistent application of an indentation\n" +
        "style. To quote my own book of 17 years ago, such style distinguishes excellence from\n" +
        "mere competence. The Japanese worldview understands the crucial value of the everyday\n" +
        "worker and, more so, of the systems of development that owe to the simple, everyday\n" +
        "actions of those workers. Quality is the result of a million selfless acts of care—not just of\n" +
        "any great method that descends from the heavens. That these acts are simple doesn’t mean\n" +
        "that they are simplistic, and it hardly means that they are easy. They are nonetheless the\n" +
        "fabric of greatness and, more so, of beauty, in any human endeavor. To ignore them is not\n" +
        "yet to be fully human.\n" +
        "Of course, I am still an advocate of thinking at broader scope, and particularly of the\n" +
        "value of architectural approaches rooted in deep domain knowledge and software usability.\n" +
        "The book isn’t about that—or, at least, it isn’t obviously about that. This book has a subtler\n" +
        "message whose profoundness should not be underappreciated. It fits with the current saw\n" +
        "of the really code-based people like Peter Sommerlad, Kevlin Henney and Giovanni\n" +
        "Asproni. “The code is the design” and “Simple code” are their mantras. While we must\n" +
        "take care to remember that the interface is the program, and that its structures have much\n" +
        "to say about our program structure, it is crucial to continuously adopt the humble stance\n" +
        "that the design lives in the code. And while rework in the manufacturing metaphor leads to\n" +
        "cost, rework in design leads to value. We should view our code as the beautiful articulation\n" +
        "of noble efforts of design—design as a process, not a static endpoint. It’s in the code that\n" +
        "the architectural metrics of coupling and cohesion play out. If you listen to Larry Constantine\n" +
        "describe coupling and cohesion, he speaks in terms of code—not lofty abstract concepts\n" +
        "that one might find in UML. Richard Gabriel advises us in his essay, “Abstraction\n" +
        "Descant” that abstraction is evil. Code is anti-evil, and clean code is perhaps divine.\n" +
        "Going back to my little box of Ga-Jol, I think it’s important to note that the Danish\n" +
        "wisdom advises us not just to pay attention to small things, but also to be honest in small\n" +
        "things. This means being honest to the code, honest to our colleagues about the state of our\n" +
        "code and, most of all, being honest with ourselves about our code. Did we Do our Best to\n" +
        "“leave the campground cleaner than we found it”? Did we re-factor our code before checking\n" +
        "in? These are not peripheral concerns but concerns that lie squarely in the center of\n" +
        "Agile values. It is a recommended practice in Scrum that re-factoring be part of the concept\n" +
        "of “Done.” Neither architecture nor clean code insist on perfection, only on honesty\n" +
        "and doing the best we can. To err is human; to forgive, divine. In Scrum, we make everything\n" +
        "visible. We air our dirty laundry. We are honest about the state of our code because\n" +
        "www.it-ebooks.info\n" +
        "Foreword xxiii\n" +
        "code is never perfect. We become more fully human, more worthy of the divine, and closer\n" +
        "to that greatness in the details.\n" +
        "In our profession, we desperately need all the help we can get. If a clean shop floor\n" +
        "reduces accidents, and well-organized shop tools increase productivity, then I’m all for\n" +
        "them. As for this book, it is the best pragmatic application of Lean principles to software I\n" +
        "have ever seen in print. I expected no less from this practical little group of thinking individuals\n" +
        "that has been striving together for years not only to become better, but also to gift\n" +
        "their knowledge to the industry in works such as you now find in your hands. It leaves the\n" +
        "world a little better than I found it before Uncle Bob sent me the manuscript.\n" +
        "Having completed this exercise in lofty insights, I am off to clean my desk.\n" +
        "James O. Coplien\n" +
        "Mørdrup, Denmark\n" +
        "www.it-ebooks.info\n"));
  }
}

