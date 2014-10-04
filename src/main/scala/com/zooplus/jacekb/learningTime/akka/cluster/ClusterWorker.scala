package com.zooplus.jacekb.learningTime.akka.cluster

import akka.actor.{ActorSystem, Props}
import akka.cluster.Cluster
import com.zooplus.jacekb.learningTime.akka.pi.Commons.Work
import com.zooplus.jacekb.learningTime.akka.pi.{Commons, Worker}

/**
 * Created with IntelliJ IDEA.
 * User: jacek_bilski
 * Date: 28/06/13
 * Time: 09:04
 */
object ClusterWorker {
	def main(args: Array[String]) {
		// Create an Akka system
		val system = ActorSystem("ClusterSystem")
		//		val clusterListener = system.actorOf(Props(new Actor with ActorLogging {
		//			def receive = {
		//				case state: CurrentClusterState ⇒
		//					log.info("Current members: {}", state.members)
		//				case MemberUp(member) ⇒
		//					log.info("Member is Up: {}", member)
		//				case UnreachableMember(member) ⇒
		//					log.info("Member detected as unreachable: {}", member)
		//				case _: ClusterDomainEvent ⇒ // ignore
		//			}
		//		}), name = "clusterListener")
		//		cluster.subscribe(clusterListener, classOf[ClusterDomainEvent])
		val worker = system.actorOf(Props[Worker], name = "worker")
	}
}
